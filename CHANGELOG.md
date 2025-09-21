# CHANGELOG

[1.1.0]
## 1/7/2024
### Updated
1. cleaned up .property files to reduce duplication

25034db having issues with site, removing error method
564744c fixed typo
4d00c28 added route for /error
91a1740 edited db url again, changed user to just root
7b5bb15 added mysql to beginning of db url and re ordered variables
d628ab5 didn't add jdbc to beginning of db url
84c5904 re added url, user, and password to app dev properties file. Attempting to use shared bariable in railway
3bd8de6 trying something that will rpobably not work
e37427f added shared variable in railway, mapping app dev property to it, or at least rying
685b9d0 db was crashing, redid db, added new db URL in app dev properties
805ba11 troubleshooting internal db issues
11619a9 trying to figure out system variable for db
f23d48e trying to use internal url for db
564e94e fixed misspelling of app prop file, edit app prop file to focus on prod, environ variable in railway will differentiate between prod and not
7b2de5e updated app dev props and app props so it hopefully works
b70be9f set up app.prop files for profiles, working as expected, need to fix trex issue -_-
97dd539 did clean up in controller, removed unneeded templates
7e7ff74 LINKS ARE VISIBLE AND WORKING WOOT
e046b93 can display results of search, links to show dino info from list of dinos is still being dumb
e6b9a9f working on debugging why hyperlinks to safe by type list isn't working
0cdfa64 having issues where list is populated but not being displayed on HTML, issue with session is also present
9fe90ce CURRENT STATE RETURNS VALUES FROM PROCEDURE TO VIEW
0f6a173 Merge branch 'main' into add-constants
344fe3f updated app prop file. Changed how procedures are called from repo
02e6f78 created and added componet for dinotypes as well updated app properties appropiately
2e8d9a3 Create README.md
1a4d51c Update application.properties
72a3df4 Update application.properties
630e04d Update application.properties
910a96a Update Dino.java
7803354 updated procfile to web: java $JAVA_OPTS -jar target/*.jar
b2b29c2 removed code in app properties for setting up postgres
e136d0b Merge branch 'dev'
873e30f project works now on MySQL db and servers
84a29b6 converting code to work on MySQL db
95d8ba2 Merge branch 'postgres-setup'
5e68f4c add profilec for heroku
e142dd0 ocde here is fine for deployment, need to redo app in heroku
3ba219b updated app properties file
72a76de made it so no compatible types are shown when t rex is elected, also tightened up spacing between current dino selected info and compatible dinos list
a71fb9a able to display compatible dinos via secondary window
562503d reduced html needed to display userMsg variable
aae4837 added calls to procedures for all dino types, added logic to handle empty input, added logic to tell user t rex has to be alone, msg clears upon resubmit
5bcc536 FINALLY GOT THE STUPID QUERY NOTATION TO WORKgit add .!
5280f30 added ability to view dino selected and stats
e1f6f61 started work on being able to display dino stats after user selects one from the dropdown
fb95405 started building out page to show user desired information
dca3c4d created base template, created dropdown with all dino names that returns the dino's id
ba32b70 added base template, index template, set up mapping for /, started to work on displaying all dinos to user
f004f9d first commit
