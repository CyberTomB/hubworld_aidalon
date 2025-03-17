(ns nr.landing)

(def landing-content
  [:div.landing.panel.content-page.blue-shade
   [:h2 "Welcome!"]
   [:p "This website is for the facilitation of Netrunner games online. Please note that jinteki.net does not provide a complete implementation of the " [:u "rules"] " of the game."]
   [:h4 "Making Jinteki.net better:"]
   [:p "Jinteki.net is the product of voluntary contributions made by many individuals. If you wish to make Jinteki.net better, found a bug and need to report an issue, or just like reading code, simply visit " [:a {:href "https://github.com/mtgred/netrunner" :target "_blank"} "our github page."]]
   [:h4 "The use of Jinteki.net:"]
   [:ul.list.compact
    [:li "Please be respectful. Any disrespectful conduct will not be tolerated regardless of the circumstance or rationale."]
    [:li "There are many deck archetypes and playstyles in Netrunner. All are valid and should be respected. If you do not wish to play against a certain deck or playstyle please write it in the game title (“No Project Vacheron” or “Experienced/New players only”). If the game has already started, politely explain to your opponent and concede the game."]
    [:li "The global chat tab should only be used for Netrunner-related discussion (including unofficial rules clarifications) and for trying to reach out to users who may have disconnected. Inappropriate use of global chat includes disputes with other players, airing grievances, and everything outlined as unacceptable behavior below."]]
   [:h4 "Examples of unacceptable behavior include, but are not limited to, the following:"]
   [:ul.list.compact
    [:li "Harassing your opponent based on their playstyle or deck."]
    [:li "Game titles which could reasonably be considered inappropriate or offensive"]
    [:li "Trolling, insulting/derogatory comments, casual use of slurs, pejorative language, personal/political attacks, harassment, intimidation, threats, or anything outside the scope of playing Netrunner."]
    [:li "The use of sexualized language or imagery."]
    [:li "Making light of/making mocking comments about trigger warnings or content warnings."]
    [:li "Deliberately using incorrect pronouns for a person, especially after being informed of the correct ones. If unsure, use gender-neutral language."]]
   [:p "To report an incident or to contact the moderation team please email jnetmods@gmail.com
If reporting an incident, please include screenshots if possible."]
   [:p "Moderators will respond to offenses by attempting to contact users for resolution where possible. Repeated/severe offenses will be reviewed by the moderation team and met with temporary or permanent bans. All bans are reviewed by the entire moderation team."]
   [:p "Moderators are not here to settle rules disputes or otherwise serve as judges. If there is a rules disagreement, bringing it to a community space is the best plan for resolution."]])

(defn landing []
  [:div.page-container
   [:div.dragons-hoard-bg]
   [:div.landing-message
    [:h4 "Visit " [:a {:href "https://www.nearearthhub.net/" :target "_blank"} "nearearthhub.net"] " for links to rules and other resources"]]
   landing-content])

