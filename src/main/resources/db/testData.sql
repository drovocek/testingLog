INSERT INTO EXERCISE (id, title, description, complexity) VALUES
(1, 'Отжимания','Сгибание рук в упоре лежа',1),
(2, 'Присядания','Сгибание ног стоя',2),
(3, 'Подтягивания','Поднимание тела к перекладине',3);

INSERT INTO TEST_DESCRIPTION (id, title, description) VALUES
(1, 'Тест_1','Легкий'),
(2, 'Тест_2','Средний'),
(3, 'Тест_3','Тяжелый');

INSERT INTO TEST_DESCRIPTION_EXERCISE (test_description_id, exercise_id) VALUES
(1, 1),
(2, 1),
(2, 2),
(3, 1),
(3, 2),
(3, 3);

commit;