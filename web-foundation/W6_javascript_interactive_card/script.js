const messages = [
    "JavaScript is working!",
    "MADHYAM is interactive!",
    "Understand. Build. Review."
];

let messageIndex = 0;

console.log("MADHYAM Interactive Card loaded.");

const message = document.getElementById("message");

console.log(message);

const changeMessageButton = document.getElementById("changeMessage");

console.log(changeMessageButton);

changeMessageButton.addEventListener("click", () => {
    message.textContent = messages[messageIndex];

    messageIndex++;

    if (messageIndex >= messages.length) {
        messageIndex = 0;
    }

    changeMessageButton.textContent = "Next Message";
});