DROP DATABASE IF EXISTS  airedejava;
CREATE DATABASE IF NOT EXISTS airedejava DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use numerosoft2015;


--
-- Structure de la table `abonne`
--

CREATE TABLE `abonne` (
  `email` varchar(50) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `journaissance` tinyint(2) NOT NULL,
  `moisnaissance` tinyint(2) NOT NULL,
  `anneenaissance` int(4) NOT NULL,
  `dateinscription` date NOT NULL,
  `inscription` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Table Abonné pour Newsletter';

--
-- Contenu de la table `abonne`
--

INSERT INTO `abonne` (`email`, `prenom`, `nom`, `journaissance`, `moisnaissance`, `anneenaissance`, `dateinscription`, `inscription`) VALUES
('toto@live.fr', 'Toto', 'Machin', 12, 5, 1965, '2016-06-07', 1),
('titi@gmail.com', 'Titi', 'Truc', 2, 6, 1959, '2016-06-25', 1),
('shrek@laposte.net', 'Shrek', 'Quipete', 3, 6, 1969, '2016-03-10', 1),
('gugusse@gmail.com', 'Gugusse', 'Geant', 27, 10, 1965, '2016-06-20', 1),
('bidon@hotmail.com', 'Bidon', 'Bidule', 10, 7, 1949, '2016-08-13', 1),
('marie@orange.fr', 'marie', 'Currie', 16, 11, 1971, '2016-06-27', 1),
('jean@gmail.com', 'Jean', 'Amirgholami', 26, 11, 1945, '2016-06-09', 1),
('david@yahoo.com', 'David', 'Galantin', 6, 2, 1963, '2016-06-09', 1),
('marion@bbox.fr', 'Marion', 'Plancq', 3, 4, 1947, '2016-09-03', 1),
('françois@neuf.fr', 'François-Xavier', 'Wockmattchieu', 12, 12, 1979, '2016-08-21', 1),
('musa@free.fr', 'Musa', 'Lheureux', 9, 11, 1977, '2016-08-26', 1),
('quentin@hotmail.fr', 'Quentin', 'Bojkowski', 6, 4, 1960, '2016-07-05', 1),
('pierre@wanadoo.fr', 'Pierre', 'Aubry', 27, 4, 1966, '2016-08-08', 1),
('philippe@gmail.com', 'Philippe', 'Bouget', 4, 2, 1959, '2016-07-24', 0);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `abonne`
--
ALTER TABLE `abonne`
  ADD PRIMARY KEY (`email`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
