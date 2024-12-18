# Sécurité du projet

## Signaler une vulnérabilité

Si vous découvrez une vulnérabilité de sécurité dans ce projet, veuillez la signaler de manière responsable en envoyant un e-mail à **[bentalbaziz648@gmail.com]**. Nous prenons la sécurité de notre projet au sérieux et nous nous efforcerons de résoudre rapidement les problèmes signalés.

## Processus de gestion des vulnérabilités

1. **Soumettre le problème** : Veuillez décrire clairement le problème dans votre rapport, y compris l'impact potentiel et les étapes pour reproduire la vulnérabilité.
2. **Examen de la vulnérabilité** : Après avoir reçu un rapport de vulnérabilité, notre équipe de sécurité l'examinera et évaluera la sévérité.
3. **Publication des correctifs** : Nous fournirons une solution sous forme de patch ou de mise à jour, que nous publierons après l'avoir testée.
4. **Annonce publique** : Une fois le problème corrigé, nous publierons une note de sécurité dans le fichier **`CHANGELOG.md`** ou une annonce publique (selon le cas).

## Meilleures pratiques de sécurité

- **Mettre à jour les dépendances** : Nous recommandons d'utiliser la dernière version stable des bibliothèques et des plugins dans le fichier `pom.xml`. Utilisez des outils comme [OWASP Dependency-Check](https://owasp.org/www-project-dependency-check/) pour scanner les dépendances pour les vulnérabilités.
- **Examen des dépendances** : Assurez-vous que toutes les dépendances externes sont fiables et proviennent de sources sûres.
- **Utiliser le plugin Maven `versions-maven-plugin`** : Ce plugin permet de vérifier la version des dépendances et de vous alerter sur les mises à jour nécessaires.
  
  Exemple de commande pour vérifier les versions des dépendances :
  ```bash
  mvn versions:display-dependency-updates
