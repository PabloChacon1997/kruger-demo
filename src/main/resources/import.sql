INSERT INTO persona(per_id, per_cedula, per_nombre, per_apellidos, per_correo) VALUES(1, 1234567890, 'Andres','Chacon', 'andres@gmail.com');
INSERT INTO persona(per_id, per_cedula, per_nombre, per_apellidos, per_correo) VALUES(2, 0987654321, 'Anna','Simmon', 'anna@gmail.com');

INSERT INTO empleado(emp_id, emp_fecha_nacimiento, emp_direccion, emp_telefono, emp_vacunado, per_id) VALUES (1, '2002-08-20', 'cdla Kennedy', '0987654321', false, 2);

INSERT INTO  usuario(usuario_id, usuario_nombre, usuario_contrasena, usuario_admin, per_id) VALUES (1, 'andres', '123ABC$$', true, 1);

INSERT INTO tipo_vacuna(tipo_vacuna_id, tipo_vacuna_nombre) VALUES (1, 'Sputnik');
INSERT INTO tipo_vacuna(tipo_vacuna_id, tipo_vacuna_nombre) VALUES (2, 'AstraZeneca');
INSERT INTO tipo_vacuna(tipo_vacuna_id, tipo_vacuna_nombre) VALUES (3, 'Pfizer');
INSERT INTO tipo_vacuna(tipo_vacuna_id, tipo_vacuna_nombre) VALUES (4, 'Jhonson&Jhonson');