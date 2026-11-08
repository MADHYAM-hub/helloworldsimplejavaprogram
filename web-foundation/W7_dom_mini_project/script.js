const messageInput = document.getElementById("messageInput");
const characterCount = document.getElementById("characterCount");

messageInput.addEventListener("input", () => {
    characterCount.textContent = messageInput.value.length;
});

const messageForm = document.getElementById("messageForm");
const messageOutput = document.getElementById("messageOutput");
const statusMessage = document.getElementById("statusMessage");

messageForm.addEventListener("submit", (event) => {
    event.preventDefault();

    const userMessage = messageInput.value.trim();

    if (userMessage === "") {
        statusMessage.textContent = "Please enter a message.";
        return;
    }

    messageOutput.textContent = userMessage;

    statusMessage.textContent = "Message published successfully!";
});

const clearButton = document.getElementById("clearButton");

clearButton.addEventListener("click", () => {
    messageInput.value = "";

    characterCount.textContent = 0;

    messageOutput.textContent = "Your message will appear here.";

    statusMessage.textContent = "Message cleared.";

    messageInput.focus();
});