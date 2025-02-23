function changeContent(category) {
    let contentBox = document.getElementById('contentBox');

    // Start fade-out effect
    contentBox.style.opacity = "0";

    setTimeout(() => {
        let contentHTML = '';

    if (category === 'sports') {
        contentHTML = `
             <div class="container2">
                <img src="https://th-i.thgim.com/public/incoming/wwcxdi/article69252671.ece/alternates/LANDSCAPE_1200/2025-02-22T164914Z_844741277_UP1EL2M1AQ0Q0_RTRMADP_3_CRICKET-		CHAMPIONSTROPHY-AUS-ENG.JPG">
                <p style="font-weight:bold;">ICC Champions Trophy: Inglis spells trouble for the Englishmen</p>
    
                <p>Australia have included three fast bowlers and a spinner while England included Jamie Smith with three frontline fast bowlers and a spinner.
		        Josh Inglis’ maiden ODI century helped Australia get off...</p>
                <a href="https://www.thehindu.com/sport/cricket/icc-champions-trophy-australia-vs-england-match-in-lahore/article69250638.ece" target="_blank">Read More...</a>
               
            </div>
            <div class="container2">
                <img src="https://th-i.thgim.com/public/incoming/fngwb9/article69253743.ece/alternates/LANDSCAPE_1200/2025-02-		22T154609Z_319018486_UP1EL2M17SVIS_RTRMADP_3_SOCCER-ENGLAND-ARS-WHU-REPORT.JPG">
                <p style="font-weight:bold;">Arsenal loses to West Ham to dent Premier League title challenge</p>
                <p>Second-place Arsenal squandered a chance to trim the gap to Liverpool to five points as Jarrod Bowen's first-half header secured a win for West Ham.
		        Arsenal's Premier League title challenge was dented...</p>
                <a href="https://www.thehindu.com/sport/football/arsenal-loses-to-west-ham-to-dent-premier-league-title-challenge/article69253742.ece" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://www.wwe.com/f/styles/wwe_16_9_xl_r/public/all/2025/02/bbbv--31096d135fd38a7931f4d9af6c17c71e.jpg">
                <p style="font-weight:bold;">The Rock is coming to WWE Elimination Chamber to see if Cody Rhodes will agree to be 'his champion'</p>
                <p>The Final Boss is coming to WWE Elimination Chamber with a very special purpose. On the Feb. 21 edition of SmackDown, The Rock called Undisputed
		        WWE Champion Cody Rhodes to the ring...</p>
                <a href="https://www.wwe.com/shows/eliminationchamber/2025/the-rock" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://th-i.thgim.com/public/sport/cricket/75iffs/article69252382.ece/alternates/LANDSCAPE_1200/20250222212L.jpg">
                <p style="font-weight:bold;">Champions Trophy: IND vs PAK: High octane games offer players best chance to showcase skills, says Aaqib Javed</p>
                <p>Pakistan head coach Aaqib Javed noted that the high-stakes nature of India-Pakistan games offers players the best chance to showcase their skills, and the extra pressure 			on the players gives this encounter its charm...</p>
                <a href="https://www.thehindu.com/sport/cricket/champions-trophy-ind-vs-pak-high-octane-games-offer-players-best-chance-to-showcase-skills-says-aaqib-javed/article69252371.ece" target="_blank">Read More...</a>
                
            </div> 
        `;
    } else if (category === 'health') {
        contentHTML = `
            <div class="container2">
                <img src="https://post.healthline.com/wp-content/uploads/2021/08/broccoli-sprouts-1296x728-header.jpg">
                <p style="font-weight:bold;">Could a broccoli sprout compound lower blood sugar?</p>
    
                <p>Prediabetes occurs when an individual’s blood sugar levels are elevated beyond the normal range but have not yet reached 
                    the threshold for a type 2 diabetes diagnosis. Now, a new study from the University of Gothenburg in Sweden, published...</p>
                <a href="https://www.medicalnewstoday.com/articles/could-a-broccoli-sprout-compound-lower-blood-sugar" target="_blank">Read More...</a>
            </div>
            <div class="container2">
                <img style=" padding-top: 10px;" src="https://s33929.pcdn.co/wp-content/uploads/sites/651/2023/11/shutterstock_2177705837-min-1600x1067.jpg">
                <p style="font-weight:bold;">Artificial sweetener may increase heart disease risk by triggering insulin surges</p>
                <p>Artificial sweetenersTrusted Source are widely used in baked goods, soft drinks, candy, puddings, canned foods, jams and jellies, dairy products, and 
                many other foods and beverages, particularly...</p>
                <a href="https://www.medicalnewstoday.com/articles/artificial-sweetener-triggers-insulin-spike-leading-to-blood-vessel-inflammation-in-mice" target="_blank">Read More...</a>
            </div>
            <div class="container2">
                <img src="https://static.toiimg.com/thumb/msid-113605472,width-1280,height-720,resizemode-4/113605472.jpg">
                <p style="font-weight:bold;">A natural supplement may help people with a new type of heart disease</p>
                <p>Experts are interested in finding the most effective treatments for new heart conditions, such as triglyceride deposit cardiomyovasculopathy...</p>
                <a href="https://www.medicalnewstoday.com/articles/natural-supplement-tricaprin-may-help-people-new-type-heart-disease" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://i.ytimg.com/vi/VHWgPPDENMo/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLDvqMR-QI7VQGDT2lP0CXmlUpPDzw">
                <p style="font-weight:bold;">Muscles: Why are they important?</p>
                <p>Muscles and nerve fibers allow a person to move their body and enable the internal organs to function. There are more than 600 muscles in the human body.
                     People also have different types of muscle....</p>
                     <a href="https://www.medicalnewstoday.com/articles/249192" target="_blank">Read More...</a>
                     
            </div> 
        `;
    } else if (category === 'cinema') {
        contentHTML = `
           <div class="container2">
                <img style="margin-top:25px" src="https://igimage.indiaglitz.com/tamil/news/dragon-movie-review2122025mp-b80.jpg">
                <p style="font-weight:bold;">Pradeep Ranganathan’s ‘Dragon’ HD version leaked online within hours of release.</p>
    
                <p>The film realistically portrays a student’s life-fun college days, romantic relationships, disregard for professors, struggling with arrears, deceiving parents, and taking shortcuts for success...</p>
                <a href="https://www.indiaglitz.com/engineering-college-pradeep-ranganathan-mysskin-ashwath-marimuthu-tamil-movie-tamil-news-362351" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img style=" padding-top: 10px;" src="https://igimage.indiaglitz.com/tamil/home/prabhudeva2322025m.jpg">
                <p style="font-weight:bold;">Prabhu Deva's Grand Debut Dance Show Captivates Youth Audience</p>
                <p>Chennai: Renowned actor and dancer Prabhu Deva's first live dance show was grandly held in Chennai yesterday. Many youngsters participated and enjoyed the performance 		with great enthusiasm. Prabhu Deva amazed the audience with his stunning dance moves...</p>
                <a href="https://www.indiaglitz.com/prabhu-deva-chennai-dance-show-live-performance-tamil-cinema-urvasi-song-tamil-news-362347" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://igimage.indiaglitz.com/tamil/home/goodbad-ugly2992024m.jpg">
                <p style="font-weight:bold;">Why 'Good Bad Ugly' Background Music is Extra Special</p>
                <p>GV Prakash recently discussed the unique aspects he infused into the background score of the movie ‘Good Bad Ugly’ in an interview. Meanwhile, he is also promoting his 		upcoming movie ‘Kingston,’ which he has acted in and produced, slated for release on March 7...</p>
                <a href="https://www.indiaglitz.com/good-bad-ugly-gv-prakash-ajith-adhik-ravichandran-background-score-tamil-news-362330" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://igimage.indiaglitz.com/tamil/home/retro1922025m.jpg">
                <p style="font-weight:bold;">Heartfelt Insights on the Touching Kannadippoove Song</p>
                <p>Music composer Santhosh Narayanan has shared an emotional post about the song ‘Kannaadi Poove’ from the movie ‘Retro’. The melody has received a warm response online, 		becoming a favorite among fans of actor Suriya as well as music lovers....</p>
                <a href="https://www.indiaglitz.com/kannaadi-poove-santhosh-narayanan-retro-movie-suriya-karthik-subbaraj-tamil-news-362243#google_vignette" target="_blank">Read More...</a>
                
            </div> 
        `;
    } else if (category === 'technology') {
        contentHTML = `
            <div class="container2">
                <img src="https://images.indianexpress.com/2025/02/Best-Tecno-phones.png?w=640">
                <p style="font-weight:bold;">Best Tecno phones that look stylish and offer great value for money</p>
                <p>Tecno is known for its budget-friendly and stylish smartphones. While it may not be as widely recognized as some other Chinese brands, it is quite popular in the offline market. If you’re considering a Tecno smartphone...</p>
                <a href="https://indianexpress.com/article/technology/mobile-tabs/best-tecno-phones-2025-under-rs-30000-9850606/" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://images.indianexpress.com/2025/02/MyJio-Pay-Bill.png?w=640">
                <p style="font-weight:bold;">MyJio makes it easy: How to pay your electricity bill in a few taps</p>
                <p>MyJio app is undoubtedly the quickest way to recharge your Jiomobile number, but did you know that it can also help you pay bills? If you are looking to clear your electricity dues without having to visit the payment centers.If you’re considering a Tecno smartphone...</p>
                <a href="https://indianexpress.com/article/technology/mobile-tabs/best-tecno-phones-2025-under-rs-30000-9850606/" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://images.indianexpress.com/2025/02/Indeed-Job-Report.jpg?w=640">
                <p style="font-weight:bold;">Skills over degrees: 80% employers prioritise practical experience, says Indeed report</p>
                <p>If you are planning for a career switch, we recommend upskilling. A new report by Indeed, a global matching and hiring platform, suggests that over 80 per cent of employers have adopted a skills-first strategy...</p>
                <a href="https://indianexpress.com/article/technology/skills-over-degrees-80-employers-prioritise-practical-experience-says-indeed-report-9848650/" target="_blank">Read More...</a>
                
            </div>
            <div class="container2">
                <img src="https://images.indianexpress.com/2025/02/apple-store-iphones.jpg?w=640">
                <p style="font-weight:bold;">What is Apple’s Advanced Data Protection, and why is its removal in the UK controversial?</p>
                <p>A feature that provides end-to-end encryption for iCloud backups, ensuring that no one but you—not even Apple—can access your data, was disabled last...</p>
                <a href="https://indianexpress.com/article/technology/tech-news-technology/apple-advanced-data-protection-removal-uk-9851486/" target="_blank">Read More...</a>
                
            </div>
        `;
    }

    contentBox.innerHTML = contentHTML;
     // Start fade-in effect
     setTimeout(() => {
        contentBox.style.opacity = "1";
    }, 50); // Small delay to prevent instant transition
}, 200);
}

function navigateTo(sectionId) {
    const section = document.getElementById(sectionId);
    if (section) {
        section.scrollIntoView({ behavior: "smooth" });
    }
}