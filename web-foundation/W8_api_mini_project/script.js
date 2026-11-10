const repositoryForm = document.getElementById("repositoryForm");
const repositoryInput = document.getElementById("repositoryInput");
const fetchButton = document.getElementById("fetchButton");
const statusMessage = document.getElementById("statusMessage");

const repositoryName = document.getElementById("repositoryName");
const repositoryDescription = document.getElementById("repositoryDescription");
const language = document.getElementById("language");
const visibility = document.getElementById("visibility");
const defaultBranch = document.getElementById("defaultBranch");
const stars = document.getElementById("stars");
const repositoryLink = document.getElementById("repositoryLink");

repositoryForm.addEventListener("submit", async (event) => {
    event.preventDefault();

    const repositoryPath = repositoryInput.value.trim();
    const parts = repositoryPath.split("/");

    if (parts.length !== 2 || !parts[0] || !parts[1]) {
        statusMessage.textContent = "Enter a valid owner/repository name.";
        return;
    }

    const [owner, repository] = parts;

    fetchButton.disabled = true;
    statusMessage.textContent = "Loading repository information...";

    try {
        const response = await fetch(
            `https://api.github.com/repos/${encodeURIComponent(owner)}/${encodeURIComponent(repository)}`
        );

        if (!response.ok) {
            throw new Error(`HTTP error: ${response.status}`);
        }

        const data = await response.json();

        repositoryName.textContent = data.full_name;
        repositoryDescription.textContent =
            data.description || "No description provided.";

        language.textContent = data.language || "Not specified";
        visibility.textContent = data.visibility || "Unknown";
        defaultBranch.textContent = data.default_branch;
        stars.textContent = data.stargazers_count;

        repositoryLink.href = data.html_url;

        statusMessage.textContent = "Repository loaded successfully!";

    } catch (error) {
        statusMessage.textContent = `Request failed: ${error.message}`;

    } finally {
        fetchButton.disabled = false;
    }
});