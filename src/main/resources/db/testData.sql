INSERT INTO EXERCISE (id, title, description, complexity) VALUES
(100, 'Отжимания','Сгибание рук в упоре лежа',1),
(101, 'Присядания','Сгибание ног стоя',2),
(102, 'Подтягивания','Поднимание тела к перекладине',3);

INSERT INTO TEST_INFO (id, title, description) VALUES
(100, 'Тест_1','Легкий'),
(101, 'Тест_2','Средний'),
(102, 'Тест_3','Тяжелый');

INSERT INTO TEST_INFO_EXERCISE (test_info_id, exercise_id) VALUES
(100, 100),
(101, 100),
(101, 101),
(102, 100),
(102, 101),
(102, 102);

commit;