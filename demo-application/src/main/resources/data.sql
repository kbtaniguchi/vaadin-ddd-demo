INSERT INTO user_admin.users (user_id)
VALUES
  ('newuser'),
  ('deleteduser'),
  ('updateduser');

INSERT INTO user_admin.transactions (transaction_id, user_id)
VALUES
  (1, 'newuser'),
  (2, 'deleteduser'),
  (3, 'updateduser'),
  (4, 'updateduser');

SELECT SETVAL('user_admin.seq_transaction_id', 4);

INSERT INTO user_admin.last_transactions (user_id, transaction_id, version)
VALUES
  ('newuser', 1, 1),
  ('deleteduser', 2, 1),
  ('updateduser', 4, 2);

INSERT INTO user_admin.profiles (transaction_id, user_name, emai_address)
VALUES
  (1, 'newuser name', 'newuser@email.com'),
  (2, 'deleteduser name', 'deleteduser@email.com'),
  (3, 'updateduser name 1', 'updateduser1@email.com'),
  (4, 'updateduser name 2', 'updateduser2@email.com');

INSERT INTO user_admin.deleted_users (user_id)
VALUES
  ('deleteduser');