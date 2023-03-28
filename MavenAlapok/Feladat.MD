# Feladat

1. Készítsetek egy **Developer** osztályt ami az alábbi mezőket tartalmazza.
   1. surname: **String**
   2. lastName: **String**
   3. pullRequest: **PullRequest**
2. Készítsetek egy **PullRequest** osztályt, ami az alábbi mezőket tartalmazza.
   1. authorUsername: **String**
   2. repositoryURL: **URL**
   2. pullRequestURL: **URL**
3. Minden osztály legyen ellátva a megfelelő, [getter, setter, equals, hashCode, toString] metódusokkal.
4. Minden osztálynak legyen egy paraméteres és egy default konstruktora is.
5. Írjatok egy **pullRequestLottery** nevű **static** metódust, ami egy **Developer** listát vár paraméterül
   és  visszatér egy **Map< Developer, List< Developer > >** mappel, ahol minden **Developer** objektumhoz kettő másik **Developer**t rendel.
6. Nyissátok meg az alábbi linket, https://github.com/ZsoltWebler/GitHubAlapok/pulls és az itt található információk alapján hozzátok létre a
   **Developer** objektumokat majd az így kapott listával hívjátok meg a **pullRequestLottery** metódust.
7. A **pullRequestLottery** eredményét, az alábbi formában irassátok ki a konzolra.

`Teszt Elek -nek a Kis Jakab és Nagy Ottó pullrequest-je jutott.`

8. Irassátok ki a konzolra, a teljes **Map< Developer, List< Developer > >** map-et, **json** formában.