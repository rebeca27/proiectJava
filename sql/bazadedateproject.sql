CREATE TABLE `User` (
  `id` int UNIQUE PRIMARY KEY AUTO_INCREMENT,
  `nume` varchar(255),
  `prenume` varchar(255),
  `permisiune` boolean,
  `mail` varchar(255),
  `parola` varchar(255),
  `id_facultate` int
);

CREATE TABLE `Attendee` (
  `id_facultate` int,
  `id_user` int
);

CREATE TABLE `Inscriere` (
  `id_sala` int,
  `id_user` int
);

CREATE TABLE `Facultate` (
  `id` int UNIQUE PRIMARY KEY AUTO_INCREMENT,
  `nume` varchar(255)
);

CREATE TABLE `Sala` (
  `id` int UNIQUE PRIMARY KEY AUTO_INCREMENT,
  `nume` varchar(255),
  `descriere` varchar(255),
  `stare` boolean
);

CREATE TABLE `Rezervare` (
  `id` int UNIQUE PRIMARY KEY AUTO_INCREMENT,
  `id_sala` int,
  `id_user` int,
  `start` timestamp,
  `finish` timestamp,
  `motiv` varchar(255),
  `estimat_rezervare` int
);

ALTER TABLE `Attendee` ADD FOREIGN KEY (`id_facultate`) REFERENCES `Facultate` (`id`);

ALTER TABLE `Attendee` ADD FOREIGN KEY (`id_user`) REFERENCES `User` (`id`);

ALTER TABLE `Inscriere` ADD FOREIGN KEY (`id_sala`) REFERENCES `Sala` (`id`);

ALTER TABLE `Inscriere` ADD FOREIGN KEY (`id_user`) REFERENCES `User` (`id`);

ALTER TABLE `Rezervare` ADD FOREIGN KEY (`id_sala`) REFERENCES `Sala` (`id`);

ALTER TABLE `Rezervare` ADD FOREIGN KEY (`id_user`) REFERENCES `User` (`id`);
