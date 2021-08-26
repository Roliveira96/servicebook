INSERT INTO states (name, uf)
VALUES ('Acre', 'AC'),
       ('Alagoas', 'AL'),
       ('Amapá', 'AP'),
       ('Amazonas', 'AM'),
       ('Bahia', 'BA'),
       ('Ceará', 'CE'),
       ('Distrito Federal', 'DF'),
       ('Espírito Santo', 'ES'),
       ('Goiás', 'GO'),
       ('Maranhão', 'MA'),
       ('Mato Grosso', 'MT'),
       ('Mato Grosso do Sul', 'MS'),
       ('Minas Gerais', 'MG'),
       ('Pará', 'PA'),
       ('Paraíba', 'PB'),
       ('Paraná', 'PR'),
       ('Pernambuco', 'PE'),
       ('Piauí', 'PI'),
       ('Rio de Janeiro ', 'RJ'),
       ('Rio Grande do Norte ', 'RN'),
       ('Rio Grande do Sul', 'RS'),
       ('Rondônia', 'RO'),
       ('Roraima', 'RR'),
       ('Santa Catarina', 'SC'),
       ('São Paulo ', 'SP'),
       ('Sergipe', 'SE'),
       ('Tocantins', 'TO');



INSERT INTO cities (image, name, state_id)
VALUES ('https://i.imgur.com/qMKc4rf.png', 'Guarapuava', '16');



INSERT INTO addresses (neighborhood, number, postal_code, street, city_id)
VALUES ('Industrial', '800', '85053-525', 'Avenida Professora Laura Pacheco Bastos', '1');



INSERT INTO users
(birth_date, email, email_verified, gender, name, phone_number, phone_verified, profile_picture, profile_verified,
 address_id)
VALUES ('2021-01-01', 'profissional1@gmail.com', 'true', 'MASCULINE', 'Profissional 1', '(42)9 9999-9999', 'true',
        'https://i.imgur.com/owhNAKK.png', 'true', '1'),
       ('2021-01-01', 'profissional2@gmail.com', 'true', 'MASCULINE', 'Profissional 2', '(42)9 9999-9999', 'true',
        'https://i.imgur.com/sHAg9pz.png', 'true', '1'),
       ('2021-01-01', 'cliente1@gmail.com', 'true', 'MASCULINE', 'Cliente 1', '(42)9 9999-9999', 'true',
        'https://i.imgur.com/y9dH2bJ.jpeg', 'true', '1'),
       ('2021-01-01', 'cliente2@gmail.com', 'true', 'MASCULINE', 'Cliente 2', '(42)9 9999-9999', 'true',
        'https://i.imgur.com/dA6qCJO.png', 'true', '1');



INSERT INTO professionals (cpf, description, rating, denounce_amount, id)
VALUES ('111111111', 'Descrição do profissional 1', '5', '1', '1'),
       ('222222222', 'Descrição do profissional 2', '5', '1', '2');



INSERT INTO clients (usuario_id)
VALUES ('3'),
       ('4');



INSERT INTO expertises (name)
VALUES ('Encanador'),
       ('Eletricista'),
       ('Pintor'),
       ('Mecânico');



INSERT INTO professional_expertises (expertise_id, professional_id, rating)
VALUES (1, 1, 1),
       (2, 1, 2),
       (3, 1, 3),
       (4, 1, 4);



INSERT INTO job_requests
(client_confirmation, date_created, date_expired, description, professional_confirmation, quantity_candidators_max,
 status, client_id, expertise_id)
VALUES ('true', '2021-01-01', '2021-01-01', 'Preciso de um Encanador 1!', 'true', '5', 'AVAILABLE', '3', '1'),
       ('true', '2021-01-01', '2021-01-02', 'Preciso de um Encanador 2!', 'true', '10', 'AVAILABLE', '3', '1'),
       ('true', '2021-01-01', '2021-01-07', 'Preciso de um Encanador 3!', 'true', '15', 'AVAILABLE', '3', '1'),
       ('true', '2021-01-01', '2021-01-08', 'Preciso de um Encanador 4!', 'true', '20', 'CLOSED', '3', '1'),
       ('true', '2021-01-01', '2021-01-30', 'Preciso de um Eletricista 1!', 'true', '5', 'AVAILABLE', '3', '2'),
       ('true', '2021-01-01', '2021-02-02', 'Preciso de um Eletricista 2!', 'true', '10', 'AVAILABLE', '3', '2'),
       ('true', '2021-01-01', '2021-03-01', 'Preciso de um Eletricista 3!', 'true', '15', 'AVAILABLE', '4', '2'),
       ('true', '2021-01-01', '2021-04-01', 'Preciso de um Eletricista 4!', 'true', '20', 'CLOSED', '4', '2'),
       ('true', '2021-01-01', '2021-01-01', 'Preciso de um Pintor 1!', 'true', '5', 'AVAILABLE', '4', '3'),
       ('true', '2021-01-01', '2021-01-02', 'Preciso de um Pintor 2!', 'true', '10', 'AVAILABLE', '4', '3'),
       ('true', '2021-01-01', '2021-01-03', 'Preciso de um Pintor 3!', 'true', '15', 'AVAILABLE', '4', '3'),
       ('true', '2021-01-01', '2021-01-04', 'Preciso de um Pintor 4!', 'true', '20', 'AVAILABLE', '4', '3');



INSERT INTO job_contracted (comments, rating, job_request, professional)
VALUES ('Ótimo Encanador!', '5', '4', '1'),
       ('Bom Encanador!', '3', '8', '1');



INSERT INTO job_candidates (job_id, professional_id, chosen_by_budget, date, is_quit)
VALUES ('1', '1', 'false', '2021-01-01', 'false'),
       ('2', '1', 'false', '2021-01-02', 'false'),
       ('5', '1', 'false', '2021-01-29', 'false'),
       ('6', '1', 'false', '2021-01-02', 'false'),
       ('9', '1', 'false', '2021-01-01', 'false');


