<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>

<h1>Exemples</h1>
<p>Dans cette application Web vous trouverez des fonctionnalités courantes pour JavaEE</p>
<ul>
	<li>Gestion des Cookies</li>
	<li>Gestion avec DAO (Data Access Object) avec la table utilisateur à déployer</li>
	<li>Gestion avec JDBC via un controleur avec la table abonné à déployer</li>
	<li>Gestion des objets stockés en Session</li>
	<li>Gestion des Upload de fichier depuis un formulaire (il faut juste créer un répertoire <code>c:/fichiers/fichier/</code>)</li>
</ul>


<h2>Formulaire</h2>

<c:if test="${ !empty form.resultat }" >
	<p> <c:out value="${ form.resultat }"></c:out> </p>
</c:if>

<form action="controleur" method="post">
	<label for="login">login :</label>
	<input type="text" id="login" name="login">
	 <label for="password">Mot de passe</label>
	<input type="password" id="password" name="password">
	<input  type="submit">
</form>

<h2>Liens pour effectuer les tests en appelant les différents controleurs</h2>

<p>
<a href="controleurUpload">Formulaire Upload de fichier</a>
</p>
<p>
<a href="controleurSession">Formulaire de test de Session</a>
</p>
<p>
<a href="controleurCookie">Formulaire de test de Cookie</a>
</p>
<p>
<a href="controleurJDBC">Formulaire de test de JDBC</a>
</p>
<p>
<a href="controleurDAO">Formulaire de test de DAO</a>
</p>
</body>
</html>
