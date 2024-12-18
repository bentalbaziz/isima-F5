AwesomePasswordChecker
Description du projet

AwesomePasswordChecker est une bibliothèque Java permettant de :

    Évaluer la robustesse des mots de passe en fonction d'un ensemble de centres de clusters.
    Calculer la distance euclidienne minimale entre un mot de passe et des clusters prédéfinis pour analyser sa force.
    Générer des masques caractéristiques pour les mots de passe.
    Calculer le hash MD5 d'une chaîne donnée.

Ce projet utilise des concepts avancés comme l'analyse de distances euclidiennes, le traitement de fichiers CSV et l'implémentation de l'algorithme MD5.
Fonctionnalités principales

    Analyse de mots de passe : Évalue la robustesse d'un mot de passe en se basant sur des centres de clusters.
    Génération de masques : Transforme un mot de passe en un tableau d'entiers représentant ses caractéristiques.
    Calcul de distances : Mesure la distance entre un mot de passe et des données de référence.
    Génération de hash MD5 : Calcule le hachage MD5 d'une chaîne de caractères.

Prérequis

Pour utiliser AwesomePasswordChecker, vous devez avoir :

    Java (JDK 8 ou supérieur)
    Apache Maven (pour compiler et exécuter le projet)
    Un fichier CSV de centres de clusters (cluster_centers_HAC_aff.csv) placé dans les ressources.