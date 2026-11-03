
const menuBtn = document.getElementById("menuBtn");
const navMenu = document.getElementById("navMenu");
const settingsBtn = document.getElementById("settingsBtn");
const settingsPanel = document.getElementById("settingsPanel");

menuBtn.addEventListener("click", () => {
    navMenu.classList.toggle("show");
    settingsPanel.classList.remove("show");
});

settingsBtn.addEventListener("click", () => {
    settingsPanel.classList.toggle("show");
});

document.querySelectorAll("#navMenu a").forEach(link => {
    link.addEventListener("click", () => {
        navMenu.classList.remove("show");
    });
});

// QUOTATIONS
const quotes = {
    en: [
        "Great things are built one step at a time.",
        "Every expert was once a beginner.",
        "Dream big, start small, and keep learning.",
        "Your future is created by what you do today.",
        "Don't stop learning. Keep improving.",
        "Success begins with the decision to try."
    ],
    te: [
        "గొప్ప విజయాలు ఒక్కో అడుగుతో నిర్మించబడతాయి.",
        "ప్రతి నిపుణుడు ఒకప్పుడు ప్రారంభకుడే.",
        "పెద్ద కలలు కనండి, చిన్నగా ప్రారంభించండి.",
        "ఈ రోజు మీ ప్రయత్నమే మీ భవిష్యత్తును నిర్మిస్తుంది.",
        "నేర్చుకోవడం ఆపకండి. అభివృద్ధి చెందండి."
    ],
    hi: [
        "बड़ी सफलताएँ एक-एक कदम से बनती हैं।",
        "हर विशेषज्ञ कभी एक शुरुआती था।",
        "बड़े सपने देखो और छोटी शुरुआत करो।",
        "आज की मेहनत आपका भविष्य बनाती है।",
        "सीखना बंद मत करो। आगे बढ़ते रहो।"
    ]
};

let quoteIndex = 0;
let currentLanguage = "en";

const quoteText = document.getElementById("quoteText");
const quoteBtn = document.getElementById("quoteBtn");

function showQuote() {
    const list = quotes[currentLanguage];
    quoteText.textContent = list[quoteIndex % list.length];
    quoteIndex++;
}

quoteBtn.addEventListener("click", showQuote);

// LANGUAGE SETTINGS
const translations = {
    en: {
        home: "Home",
        settings: "Settings",
        game: "Mini Game",
        language: "Choose Language",
        welcome: "WELCOME TO MY PORTFOLIO",
        heroTitle: "Hello, I'm Akshay",
        heroSubtitle: "Technology Enthusiast | Beginner Web Developer",
        heroText: "I enjoy learning technology, creating websites and exploring new ideas. This is my personal space to share what I'm learning.",
        discover: "Discover More",
        aboutLabel: "GET TO KNOW ME",
        aboutTitle: "About Me",
        aboutText: "I'm interested in computers, programming and website development. I enjoy learning how websites work and improving my skills by building projects.",
        interests: "Interests:",
        interestList: "Technology, coding, creativity and learning new things.",
        skillsLabel: "WHAT I'M LEARNING",
        skillsTitle: "My Skills",
        htmlShort: "The structure of a website.",
        cssShort: "The design and appearance of a website.",
        javaShort: "A programming language.",
        explore: "Explore More →",
        inspiration: "A LITTLE INSPIRATION",
        quoteTitle: "Daily Motivation",
        newQuote: "See Another Quote",
        playTime: "TAKE A SHORT BREAK",
        gameTitle: "Number Guessing Game",
        gameInstructions: "I'm thinking of a number between 1 and 10. Can you guess it?",
        guess: "Guess",
        playAgain: "Play Again",
        getInTouch: "LET'S CONNECT",
        contactTitle: "Contact Me",
        contactText: "Have a question or want to talk about technology? Send me an email.",
        footer: "Made with curiosity and creativity."
    },
    te: {
        home: "హోమ్",
        settings: "సెట్టింగ్స్",
        game: "చిన్న ఆట",
        language: "భాషను ఎంచుకోండి",
        welcome: "నా పోర్ట్‌ఫోలియోకు స్వాగతం",
        heroTitle: "హలో, నేను అక్షయ్",
        heroSubtitle: "సాంకేతికతపై ఆసక్తి | వెబ్ డెవలప్‌మెంట్ నేర్చుకుంటున్నాను",
        heroText: "సాంకేతికత నేర్చుకోవడం, వెబ్‌సైట్‌లు తయారు చేయడం మరియు కొత్త విషయాలను అన్వేషించడం నాకు ఇష్టం.",
        discover: "మరింత తెలుసుకోండి",
        aboutLabel: "నా గురించి తెలుసుకోండి",
        aboutTitle: "నా గురించి",
        aboutText: "కంప్యూటర్లు, ప్రోగ్రామింగ్ మరియు వెబ్‌సైట్ డెవలప్‌మెంట్‌పై నాకు ఆసక్తి ఉంది. ప్రాజెక్ట్‌లు చేస్తూ నా నైపుణ్యాలను మెరుగుపరుచుకుంటాను.",
        interests: "ఆసక్తులు:",
        interestList: "సాంకేతికత, కోడింగ్, సృజనాత్మకత మరియు కొత్త విషయాలు నేర్చుకోవడం.",
        skillsLabel: "నేను నేర్చుకుంటున్నవి",
        skillsTitle: "నా నైపుణ్యాలు",
        htmlShort: "వెబ్‌సైట్ నిర్మాణం.",
        cssShort: "వెబ్‌సైట్ రూపకల్పన.",
        javaShort: "ఒక ప్రోగ్రామింగ్ భాష.",
        explore: "మరింత తెలుసుకోండి →",
        inspiration: "కొంత ప్రేరణ",
        quoteTitle: "రోజువారీ ప్రేరణ",
        newQuote: "మరో సూక్తి చూడండి",
        playTime: "చిన్న విరామం తీసుకోండి",
        gameTitle: "సంఖ్యను ఊహించే ఆట",
        gameInstructions: "1 నుండి 10 మధ్య ఒక సంఖ్యను నేను అనుకుంటున్నాను. మీరు ఊహించగలరా?",
        guess: "ఊహించండి",
        playAgain: "మళ్లీ ఆడండి",
        getInTouch: "మనమందరం కలుద్దాం",
        contactTitle: "నన్ను సంప్రదించండి",
        contactText: "సాంకేతికత గురించి మాట్లాడాలనుకుంటున్నారా? నాకు ఇమెయిల్ పంపండి.",
        footer: "ఆసక్తి మరియు సృజనాత్మకతతో రూపొందించబడింది."
    },
    hi: {
        home: "होम",
        settings: "सेटिंग्स",
        game: "छोटा गेम",
        language: "भाषा चुनें",
        welcome: "मेरे पोर्टफोलियो में आपका स्वागत है",
        heroTitle: "नमस्ते, मैं अक्षय हूँ",
        heroSubtitle: "टेक्नोलॉजी में रुचि | शुरुआती वेब डेवलपर",
        heroText: "मुझे टेक्नोलॉजी सीखना, वेबसाइट बनाना और नए विचारों को जानना पसंद है।",
        discover: "और जानें",
        aboutLabel: "मेरे बारे में जानें",
        aboutTitle: "मेरे बारे में",
        aboutText: "मुझे कंप्यूटर, प्रोग्रामिंग और वेबसाइट डेवलपमेंट में रुचि है। प्रोजेक्ट बनाकर मैं अपने कौशल को बेहतर बनाता हूँ।",
        interests: "रुचियाँ:",
        interestList: "टेक्नोलॉजी, कोडिंग, रचनात्मकता और नई चीजें सीखना।",
        skillsLabel: "मैं क्या सीख रहा हूँ",
        skillsTitle: "मेरे कौशल",
        htmlShort: "वेबसाइट की संरचना।",
        cssShort: "वेबसाइट का डिज़ाइन।",
        javaShort: "एक प्रोग्रामिंग भाषा।",
        explore: "और जानें →",
        inspiration: "थोड़ी प्रेरणा",
        quoteTitle: "दैनिक प्रेरणा",
        newQuote: "एक और विचार देखें",
        playTime: "थोड़ा ब्रेक लें",
        gameTitle: "नंबर अनुमान गेम",
        gameInstructions: "मैं 1 से 10 के बीच एक नंबर सोच रहा हूँ। क्या आप अनुमान लगा सकते हैं?",
        guess: "अनुमान लगाएँ",
        playAgain: "फिर से खेलें",
        getInTouch: "संपर्क करें",
        contactTitle: "मुझसे संपर्क करें",
        contactText: "टेक्नोलॉजी के बारे में बात करना चाहते हैं? मुझे ईमेल भेजें।",
        footer: "जिज्ञासा और रचनात्मकता से बनाया गया।"
    }
};

const languageSelect = document.getElementById("languageSelect");

function changeLanguage(language) {
    currentLanguage = language;

    document.querySelectorAll("[data-i18n]").forEach(element => {
        const key = element.dataset.i18n;
        if (translations[language][key]) {
            element.textContent = translations[language][key];
        }
    });

    quoteIndex = 0;
    showQuote();

    languageSelect.value = language;
    document.documentElement.lang = language;
}

languageSelect.addEventListener("change", event => {
    changeLanguage(event.target.value);
});

// NUMBER GUESSING GAME
let secretNumber = Math.floor(Math.random() * 10) + 1;

const guessInput = document.getElementById("guessInput");
const guessBtn = document.getElementById("guessBtn");
const gameResult = document.getElementById("gameResult");
const resetGame = document.getElementById("resetGame");

guessBtn.addEventListener("click", () => {
    const guess = Number(guessInput.value);

    if (!guessInput.value || guess < 1 || guess > 10) {
        gameResult.textContent = "Please enter a number from 1 to 10.";
        return;
    }

    if (guess === secretNumber) {
        gameResult.textContent = "Correct! You guessed the number!";
    } else if (guess < secretNumber) {
        gameResult.textContent = "Try a higher number!";
    } else {
        gameResult.textContent = "Try a lower number!";
    }
});

resetGame.addEventListener("click", () => {
    secretNumber = Math.floor(Math.random() * 10) + 1;
    guessInput.value = "";
    gameResult.textContent = "";
});

showQuote();
          quoteText.textContent110element.textContentlanguageSelect.valuedocument.documentElement.langgameResult.textContentguessInput.value
