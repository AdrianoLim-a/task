DROP TABLE IF EXISTS task;

CREATE TABLE task(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	description  VARCHAR(250) NOT NULL
);

INSERT INTO task (name, description) VALUES

 ('name1', 'Primeira Tarefa'),
 ('name2', 'Segunda Tarefa'),
 ('name3', 'Terceira Tarefa');