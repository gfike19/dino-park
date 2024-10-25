# CHANGELOG

Newer entries will follow [How to keep a Changelog](https://keepachangelog.com/en/1.1.0/). Following was added using `git log > CHANGELOG.md` for record keeping purposes.

## 10/25/2024
### Updated
README now has prod link, and list of current issues.
### Added
CHANGELOG added with entries via `git` command.

***

commit 564e94ec953f6fb209edeaf663ed710f5a506838
Author: gfike19 <gfike19@gmail.com>
Date:   Fri Oct 25 17:53:19 2024 -0500

    fixed misspelling of app prop file, edit app prop file to focus on prod, environ variable in railway will differentiate between prod and not

commit 7b2de5ecabecb520ef2136364da28ce09bee5acf
Author: gfike19 <gfike19@gmail.com>
Date:   Fri Oct 25 17:43:57 2024 -0500

    updated app dev props and app props so it hopefully works

commit b70be9f4422bbe894d4766779e99c801930316d3
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 18:56:05 2024 -0500

    set up app.prop files for profiles, working as expected, need to fix trex issue -_-

commit 97dd539963c19df5317e1b52b50d5a45ec0f0f5c
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 18:44:15 2024 -0500

    did clean up in controller, removed unneeded templates

commit 7e7ff747231f610fdf8454cae3ec0328d66ac07b
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 18:24:08 2024 -0500

    LINKS ARE VISIBLE AND WORKING WOOT

commit e046b935d240756a82c35e1aadf141947e85787a
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 17:25:08 2024 -0500

    can display results of search, links to show dino info from list of dinos is still being dumb

commit e6b9a9fde27b1a2f473e430401f8909e6b519066
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 15:21:21 2024 -0500

    working on debugging why hyperlinks to safe by type list isn't working

commit 0cdfa64cc2f5692c2e5c05165b92195ed5c351cb
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 08:30:09 2024 -0500

    having issues where list is populated but not being displayed on HTML, issue with session is also present

commit 9fe90ce78c9ae71edb7512522724c8b3ab545893
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Oct 24 08:00:59 2024 -0500

    CURRENT STATE RETURNS VALUES FROM PROCEDURE TO VIEW

commit 0f6a1733c91a0091d924c0e287cc3f777ff3017d
Merge: 02e6f78 344fe3f
Author: gfike19 <gfike19@gmail.com>
Date:   Wed Oct 23 14:58:49 2024 -0500

    Merge branch 'main' into add-constants

commit 344fe3f880e75124e5d9dad8ad03c646985ea6cf
Author: gfike19 <gfike19@gmail.com>
Date:   Sat Oct 19 15:26:02 2024 -0500

    updated app prop file. Changed how procedures are called from repo

commit 02e6f788f3bd17cdb40225ba850b84abcbf2b2ad
Author: gfike19 <gfike19@gmail.com>
Date:   Tue Oct 8 20:59:21 2024 -0500

    created and added componet for dinotypes as well updated app properties appropiately

commit 2e8d9a34cc16adb88081b27e1fc0dc31d7c33344
Author: Gail Fike <gfike19@gmail.com>
Date:   Sat Oct 5 22:04:41 2024 -0500

    Create README.md
    
    added README

commit 1a4d51c2380ce40e2bb19447e014a187919ed6e0
Author: Gail Fike <gfike19@gmail.com>
Date:   Sat Oct 5 19:32:32 2024 -0500

    Update application.properties
    
    trying again to connect app to database on railway

commit 72a3df4caf07242d572e017557700625fe0057da
Author: Gail Fike <gfike19@gmail.com>
Date:   Sat Oct 5 19:01:33 2024 -0500

    Update application.properties
    
    trying again to get internal railway db to work

commit 630e04d6fa75bb9e8bd3b713e2465a24871f0508
Author: Gail Fike <gfike19@gmail.com>
Date:   Sat Oct 5 18:41:29 2024 -0500

    Update application.properties
    
    updated with URL from railway

commit 910a96ab2576928e3e41768c015b56e8c42a03bd
Author: Gail Fike <gfike19@gmail.com>
Date:   Sat Oct 5 18:26:59 2024 -0500

    Update Dino.java
    
    added private to social group max variable

commit 78033546da43389c7d66b5f41821921d0da36494
Author: gfike19 <gfike19@gmail.com>
Date:   Fri Mar 18 15:36:41 2022 -0500

    updated procfile to web: java $JAVA_OPTS -jar target/*.jar

commit b2b29c27de26e3c0099855b7f79c03a469ea8497
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Jul 29 09:10:54 2021 -0500

    removed code in app properties for setting up postgres

commit e136d0bf33d99a2f8dfa106f69162d7a4585068b
Merge: 95d8ba2 873e30f
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Jul 29 08:48:35 2021 -0500

    Merge branch 'dev'

commit 873e30fd8a094c5410f722029d3b22e4dd3a3dba
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Jul 29 08:48:19 2021 -0500

    project works now on MySQL db and servers

commit 84a29b6daf69aab80ea9ad701fe523126b73a0ae
Author: gfike19 <gfike19@gmail.com>
Date:   Thu Jul 29 08:42:46 2021 -0500

    converting code to work on MySQL db

commit 95d8ba295cde5d061ddd4cfa8f7e3faf812cc575
Merge: 5e68f4c e142dd0
Author: Gail <gfike19@gmail.com>
Date:   Tue Mar 30 12:40:06 2021 -0500

    Merge branch 'postgres-setup'

commit 5e68f4c741bc507ad5e9b17db9eb405a832980bf
Author: Gail <gfike19@gmail.com>
Date:   Tue Mar 30 11:49:23 2021 -0500

    add profilec for heroku

commit e142dd0b025ac892d22a22cbe9ca4baf56b897d4
Author: Gail <gfike19@gmail.com>
Date:   Mon Mar 29 16:07:05 2021 -0500

    ocde here is fine for deployment, need to redo app in heroku

commit 3ba219bf847a9775efcc8285837abbdbd5ec36b4
Author: Gail <gfike19@gmail.com>
Date:   Mon Mar 29 10:20:42 2021 -0500

    updated app properties file

commit 72a76de4070e44b1d24c3a54f7404e93e043214f
Author: gfike19 <gfike19@gmail.com>
Date:   Mon Mar 29 01:05:40 2021 -0500

    made it so no compatible types are shown when t rex is elected, also tightened up spacing between current dino selected info and compatible dinos list

commit a71fb9a481e3374443b3e596504bef4b75557128
Author: gfike19 <gfike19@gmail.com>
Date:   Sun Mar 28 22:55:08 2021 -0500

    able to display compatible dinos via secondary window

commit 562503da9dba17c9f638648d8db04b21c2a05964
Author: gfike19 <gfike19@gmail.com>
Date:   Sat Mar 27 17:29:18 2021 -0500

    reduced html needed to display userMsg variable

commit aae4837c7f04b279e17a8dc5b39ab1e38ca55aa2
Author: gfike19 <gfike19@gmail.com>
Date:   Sat Mar 27 17:24:30 2021 -0500

    added calls to procedures for all dino types, added logic to handle empty input, added logic to tell user t rex has to be alone, msg clears upon resubmit

commit 5bcc536caf6470fe65b45ef41c16f852878b4c66
Author: gfike19 <gfike19@gmail.com>
Date:   Sat Mar 27 15:28:17 2021 -0500

    FINALLY GOT THE STUPID QUERY NOTATION TO WORKgit add .!

commit 5280f30de7d5c841a62e73c7158438086e9ba876
Author: gfike19 <gfike19@gmail.com>
Date:   Tue Mar 23 22:47:51 2021 -0500

    added ability to view dino selected and stats

commit e1f6f61cac8f69859ee8acc45cd59b104abe79a9
Author: Gail <gfike19@gmail.com>
Date:   Tue Mar 23 16:13:35 2021 -0500

    started work on being able to display dino stats after user selects one from the dropdown

commit fb954059b64bd9c4ed12630a2c2478df9d27922d
Author: Gail <gfike19@gmail.com>
Date:   Mon Mar 22 22:22:05 2021 -0500

    started building out page to show user desired information

commit dca3c4ddab982e8449bb4e900d608f7a4ad10d2a
Author: Gail <gfike19@gmail.com>
Date:   Mon Mar 22 22:05:21 2021 -0500

    created base template, created dropdown with all dino names that returns the dino's id

commit ba32b70665e1fa6d00f508395a4e1483609e42d7
Author: Gail <gfike19@gmail.com>
Date:   Sun Mar 21 16:52:01 2021 -0500

    added base template, index template, set up mapping for /, started to work on displaying all dinos to user

commit f004f9d6b14fc315bbb7713b2b7628bee6e0cc13
Author: Gail <gfike19@gmail.com>
Date:   Sun Mar 21 14:51:59 2021 -0500

    first commit
