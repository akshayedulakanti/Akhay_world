
// MOBILE NAVIGATION

const menuBtn = document.getElementById("menuBtn");
const navLinks = document.getElementById("navLinks");

menuBtn.addEventListener("click", () => {

    navLinks.classList.toggle("active");

    menuBtn.textContent =
        navLinks.classList.contains("active") ? "✕" : "☰";

});

document.querySelectorAll(".nav-links a").forEach(link => {

    link.addEventListener("click", () => {

        navLinks.classList.remove("active");
        menuBtn.textContent = "☰";

    });

});


// SKILL DETAILS

const skillDetails = {

    html: {
        title: "HTML - HyperText Markup Language",
        description:
        "HTML is the foundation of web development. It creates the structure of a webpage using headings, paragraphs, images, links, lists and other elements."
    },

    css: {
        title: "CSS - Cascading Style Sheets",
        description:
        "CSS is used to make websites visually attractive. It controls colours, fonts, layouts, backgrounds, spacing, animations and responsive designs."
    },

    java: {
        title: "Java - Programming Language",
        description:
        "Java is a programming language used to build applications and software. It introduces programming concepts such as variables, loops, conditions, objects and logical problem-solving."
    }

};

const skillModal = document.getElementById("skillModal");
const modalTitle = document.getElementById("modalTitle");
const modalDescription =
    document.getElementById("modalDescription");

document.querySelectorAll(".skill-card").forEach(card => {

    card.addEventListener("click", () => {

        const skill = card.dataset.skill;

        modalTitle.textContent =
            skillDetails[skill].title;

        modalDescription.textContent =
            skillDetails[skill].description;

        skillModal.style.display = "flex";

    });

});


// CLOSE SKILL POPUP

function closeModal() {
    skillModal.style.display = "none";
}

document.getElementById("closeModal")
    .addEventListener("click", closeModal);

document.getElementById("modalDone")
    .addEventListener("click", closeModal);

skillModal.addEventListener("click", event => {

    if (event.target === skillModal) {
        closeModal();
    }

});


// MOTIVATIONAL QUOTES

const quotes = [

    "Every expert was once a beginner.",

    "Dream big. Start small. Keep going.",

    "Your future is created by what you do today.",

    "Learning never stops. Keep improving.",

    "Great things take time and patience.",

    "Code your ideas. Create your future.",

    "Success begins with the courage to start."

];

let quoteIndex = 0;

document.getElementById("quoteBtn")
    .addEventListener("click", () => {

        quoteIndex = (quoteIndex + 1) % quotes.length;

        document.getElementById("quoteText").textContent =
            quotes[quoteIndex];

    });
  menuBtn.textContentmodalDescription.textContentmodalTitle.textContentskillModal.style.display
