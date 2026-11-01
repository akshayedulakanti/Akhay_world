
// MOBILE NAVIGATION

const menuBtn = document.getElementById("menuBtn");
const navMenu = document.getElementById("navMenu");

menuBtn.addEventListener("click", function () {
    const isOpen = navMenu.classList.toggle("active");

    menuBtn.classList.toggle("active", isOpen);

    menuBtn.setAttribute("aria-expanded", isOpen);

    menuBtn.setAttribute(
        "aria-label",
        isOpen ? "Close menu" : "Open menu"
    );
});


// CLOSE MENU AFTER CLICKING A LINK

const navLinks = document.querySelectorAll("#navMenu a");

navLinks.forEach(function (link) {
    link.addEventListener("click", function () {
        navMenu.classList.remove("active");
        menuBtn.classList.remove("active");

        menuBtn.setAttribute("aria-expanded", "false");
        menuBtn.setAttribute("aria-label", "Open menu");
    });
});


// AUTOMATIC COPYRIGHT YEAR

document.getElementById("year").textContent =
    new Date().getFullYear();


// SKILL INFORMATION

const skillInformation = {

    html: {
        title: "HTML",
        description:
            "HTML stands for HyperText Markup Language. It is the standard markup language used to create the structure and content of web pages.",
        usage:
            "HTML creates headings, paragraphs, images, links, buttons, forms and other elements. Think of it as the skeleton of a website.",
        example:
`<h1>Welcome to my website</h1>
<p>This is my first paragraph.</p>
<a href="https://example.com">Visit</a>`
    },

    css: {
        title: "CSS",
        description:
            "CSS stands for Cascading Style Sheets. It is used to style and design HTML elements on a website.",
        usage:
            "CSS controls colours, fonts, spacing, backgrounds, layouts, animations and responsive designs. Think of it as the appearance and clothing of a website.",
        example:
`body {
    background-color: lightblue;
    font-family: Arial;
}

h1 {
    color: blue;
    text-align: center;
}`
    },

    javascript: {
        title: "JavaScript",
        description:
            "JavaScript is a programming language that makes websites interactive and dynamic.",
        usage:
            "JavaScript can respond to button clicks, open menus, display popups, validate forms and update website content. Think of it as the behaviour and actions of a website.",
        example:
`const button = document.querySelector("button");

button.addEventListener("click", function() {
    alert("Welcome to my website!");
});`
    }

};


// OPEN SKILL POPUP

const skillCards = document.querySelectorAll(".skill-card");

const skillModal = document.getElementById("skillModal");
const modalTitle = document.getElementById("modalTitle");
const modalDescription = document.getElementById("modalDescription");
const modalUsage = document.getElementById("modalUsage");
const modalExample = document.getElementById("modalExample");

const closeModal = document.getElementById("closeModal");
const doneBtn = document.getElementById("doneBtn");

skillCards.forEach(function (card) {

    card.addEventListener("click", function () {

        const skill = card.dataset.skill;
        const information = skillInformation[skill];

        if (!information) return;

        modalTitle.textContent = information.title;
        modalDescription.textContent = information.description;
        modalUsage.textContent = information.usage;
        modalExample.textContent = information.example;

        skillModal.classList.add("show");
        skillModal.setAttribute("aria-hidden", "false");

        document.body.style.overflow = "hidden";

        closeModal.focus();
    });

});


// CLOSE POPUP

function hideSkillModal() {
    skillModal.classList.remove("show");
    skillModal.setAttribute("aria-hidden", "true");

    document.body.style.overflow = "";
}

closeModal.addEventListener("click", hideSkillModal);
doneBtn.addEventListener("click", hideSkillModal);


// CLOSE WHEN CLICKING OUTSIDE THE POPUP

skillModal.addEventListener("click", function (event) {
    if (event.target === skillModal) {
        hideSkillModal();
    }
});


// CLOSE POPUP WITH ESCAPE KEY

document.addEventListener("keydown", function (event) {
    if (event.key === "Escape") {
        hideSkillModal();
    }
});
      modalDescription.textContentmodalTitle.textContentmodalUsage.textContentmodalExample.textContentdocument.body.style.overflowmodal.showhttps://fonts.googleapis.comnav.active
