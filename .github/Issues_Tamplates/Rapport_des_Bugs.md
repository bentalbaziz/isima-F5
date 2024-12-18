Rapport des Anomalies

Anomalie 1 : Absence de constructeur par défaut dans la classe AwesomePasswordChecker

Le programme rencontre un problème lors de la création d'instances de la classe AwesomePasswordChecker. La classe ne permet pas la création d'objets sans définir explicitement un constructeur, ce qui empêche le bon fonctionnement du code. 

Anomalie 2 : Retour de NaN dans la fonction euclidien_distance

La fonction euclidien_distance renvoie la valeur NaN (Not a Number) lorsqu'elle essaie de calculer la racine carrée d'un nombre négatif. Cela se produit en raison de la tentative de calcul d'une racine carrée sur un nombre qui ne peut pas être négatif selon les règles des nombres réels. 

Anomalie 3 : Valeur constante retournée par getDistance

La fonction getDistance renvoie systématiquement la même valeur, ce qui est incorrect puisqu'elle est censée calculer une distance dynamique. Ce comportement est dû au fait que cette fonction appelle directement la fonction euclidien_distance.

Anomalie 4 : Problème de formatage des données lors de la lecture des fichiers

Lors de la lecture des fichiers, une méthode de découpe des lignes utilise line.split(";"), mais cela ne fonctionne pas correctement pour le cluster_centers_HAC_aff.csv, où les valeurs numériques sont séparées par (",").