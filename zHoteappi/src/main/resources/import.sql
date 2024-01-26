INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('01','Azuay');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('02','Bolívar');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('03','Cañar');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('04','Carchi');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('05','Chimborazo');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('06','Cotopaxi');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('07','El Oro');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('08','Esmeraldas');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('09','Galápagos');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('10','Guayas');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('11','Imbabura');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('12','Loja');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('13','Los Ríos');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('14','Manabí');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('15','Morona Santiago');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('16','Napo');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('17','Orellana');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('18','Pastaza');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('19','Pichincha');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('20','Santa Elena');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('21','Santo Domingo de los Tsáchilas');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('22','Sucumbíos');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('23','Tungurahua');
INSERT INTO `provincias`(`id_provincia`, `nombre`) VALUES ('24','Zamora Chinchipe');


INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0101','01','Cuenca');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0102','01','Camilo Ponce Enríquez');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0103','01','Chordeleg');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0104','01','El Pan');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0105','01','Girón');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0106','01','Gualaceo');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0107','01','Nabón');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0108','01','Oña');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0109','01','Paute');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0110','01','Pucará');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0111','01','San Fernando');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0112','01','Santa Isabel');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0113','01','Sevilla de Oro');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0114','01','Sígsig');

INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0201','02','Guaranda');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0202','02','Caluma');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0203','02','Chillanes');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0204','02','Chimbo');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0205','02','Echeandía');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0206','02','Las Naves');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0207','02','San Miguel');

INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0301','03','Tulcán');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0302','03','Bolívar');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0303','03','Espejo');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0304','03','Mira');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0305','03','Montúfar');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0306','03','Huaca');

INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0801','08','Esmeraldas');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0802','08','Atacames');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0803','08','Eloy Alfaro');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0804','08','Muisne');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0805','08','Quinindé');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0806','08','Rioverde');
INSERT INTO `cantones`(`id_canton`, `id_provincia`, `nombre`) VALUES ('0807','08','San Lorenzo');

INSERT INTO `personas` (`cedula_persona`, `apellido`, `apellido2`, `direccion`, `edad`, `genero`, `id_canton`, `nombre`, `nombre2`, `telefono`) VALUES ('1104337389', 'Sanchez', 'Medina', 'Control Sur', '25', 'Masculino', '0102', 'Kevin', 'Alexander', '09567312643');  
INSERT INTO `personas` (`cedula_persona`, `apellido`, `apellido2`, `direccion`, `edad`, `genero`, `id_canton`, `nombre`, `nombre2`, `telefono`) VALUES ('0107971244', 'Leon', 'Marquez', 'El Valle', '24', 'Masculino', '0102', 'Edisson', 'Fabian', '0992349767');
INSERT INTO `personas` (`cedula_persona`, `apellido`, `apellido2`, `direccion`, `edad`, `genero`, `id_canton`, `nombre`, `nombre2`, `telefono`) VALUES ('0107535445', 'Medina', 'Maldonado', 'Ochoa Leon', '20', 'Masculino', '0103', 'Jean', 'Sebastian', '09565628643');

INSERT INTO `clientes` (`id_cliente`, `cedula_persona`, `contrasena`, `foto`, `usuario`) VALUES ('1', '0107971244', '123e', NULL, 'edisson');

INSERT INTO `recepcionistas` (`sueldo`, `id_recepcionista`, `cedula_persona`, `contrasena`, `usuario`) VALUES ('500', '1', '1104337389', '123a', 'kevin');

INSERT INTO `categorias` (`id_categoria`, `nombre`) VALUES ('1', 'VIP'), ('2', 'Estandar'), ('3', 'Economica');