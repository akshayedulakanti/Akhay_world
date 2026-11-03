
// NAVIGATION MENU
const menuBtn = document.getElementById("menuBtn");
const navMenu = document.getElementById("navMenu");

menuBtn.addEventListener("click", () => {
    navMenu.classList.toggle("show");
});

// Close menu after selecting a section
document.querySelectorAll(".nav-menu a").forEach(link => {
    link.addEventListener("click", () => {
        navMenu.classList.remove("show");
    });
});

// EXPLORE MORE BUTTONS
const exploreButtons = document.querySelectorAll(".explore-btn");

exploreButtons.forEach(button => {
    button.addEventListener("click", () => {
        const targetId = button.dataset.target;
        const information = document.getElementById(targetId);

        const isOpen = !information.hidden;

        information.hidden = isOpen;
        button.textContent = isOpen ? "Explore More +" : "Show Less −";
        button.setAttribute("aria-expanded", String(!isOpen));
    });
});

// QUOTATIONS
const quotes = [
    "Every expert was once a beginner.",
    "Great things are built one step at a time.",
    "Dream big, start small, and keep learning.",
    "Your future is created by what you do today.",
    "Don't stop learning. Keep improving.",
    "Success begins with the decision to try.",
    "Believe in your ability to learn something new."
];

let quoteIndex = 0;

const quoteText = document.getElementById("quoteText");
const quoteBtn = document.getElementById("quoteBtn");

quoteBtn.addEventListener("click", () => {
    const previousIndex = quoteIndex;

    while (quoteIndex === previousIndex && quotes.length > 1) {
        quoteIndex = Math.floor(Math.random() * quotes.length);
    }

    quoteText.textContent = quotes[quoteIndex];
});

// INQUIRY FORM
const inquiryForm = document.getElementById("inquiryForm");
const formMessage = document.getElementById("formMessage");

inquiryForm.addEventListener("submit", function(event) {
    event.preventDefault();

    const name = document.getElementById("visitorName").value.trim();
    const phone = document.getElementById("visitorPhone").value.trim();
    const email = document.getElementById("visitorEmail").value.trim();
    const message = document.getElementById("visitorMessage").value.trim();

    if (!name || !phone || !email || !message) {
        formMessage.textContent = "Please fill in all the fields.";
        return;
    }

    const subject = "New Portfolio Inquiry";

    const body =
`Hello Akshay,

You have received a new inquiry from your portfolio website.

Visitor Name: ${name}
Phone Number: ${phone}
Email Address: ${email}

Message:
${message}`;

    const mailtoLink =
        "mailto:akshayedulakanti7013@gmail.com" +
        "?subject=" + encodeURIComponent(subject) +
        "&body=" + encodeURIComponent(body);

    formMessage.textContent = "Opening your email application...";

    window.location.href = mailtoLink;
});
      information.hiddenbutton.textContentquotes.lengthquoteText.textContentformMessage.textContentakshayedulakanti7013@gmail.comwindow.location.href0nav-menu.show
