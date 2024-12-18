# AwesomePasswordChecker

## Description
**AwesomePasswordChecker** est une bibliothèque Java conçue pour évaluer la robustesse des mots de passe en analysant leurs caractéristiques. Il calcule la distance entre un mot de passe et un ensemble de centres de clusters pour déterminer sa solidité. Il inclut également une méthode de hachage MD5 pour des besoins de vérification des données.

---

## Table des matières
1. [Fonctionnalités](#fonctionnalités)
2. [Prérequis](#prérequis)
3. [Installation](#installation)
4. [Utilisation](#utilisation)
5. [Exemple de code](#exemple-de-code)
6. [Structure du projet](#structure-du-projet)
7. [Auteur](#auteur)
8. [Licence](#licence)

---

## Fonctionnalités

- **Évaluation de la robustesse des mots de passe** :
  - Génération de masques spécifiques aux mots de passe.
  - Calcul de la distance euclidienne minimale entre un mot de passe et un ensemble de centres de clusters.

- **Hachage MD5** :
  - Implémentation personnalisée pour générer des empreintes MD5 de chaînes.
  

- **Lecture de fichiers CSV** :
  - Chargement des centres de clusters à partir d'un fichier CSV.

---

## Prérequis

Avant d'utiliser cette bibliothèque, assurez-vous d'avoir les éléments suivants installés sur votre machine :
- **Java Development Kit (JDK)** version **8+**
- Un **IDE** (IntelliJ, Eclipse, Visual Studio Code, etc.)
- Une bibliothèque **CSV** si besoin (optionnel, déjà géré en natif ici).

---

## Installation

1. Clonez le projet à partir de votre dépôt Git :
   ```bash
   git clone https://github.com/votre-nom/AwesomePasswordChecker.git
   cd AwesomePasswordChecker
