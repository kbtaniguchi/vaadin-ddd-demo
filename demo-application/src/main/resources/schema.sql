DROP SCHEMA IF EXISTS user_admin CASCADE;
CREATE SCHEMA user_admin;

CREATE SEQUENCE user_admin.seq_transaction_id;

CREATE TABLE user_admin.users (
  user_id    VARCHAR(30) NOT NULL,
  created_at TIMESTAMP   NOT NULL DEFAULT now(),
  CONSTRAINT pk_users PRIMARY KEY (user_id)
);

CREATE TABLE user_admin.transactions (
  transaction_id BIGINT      NOT NULL,
  user_id        VARCHAR(30) NOT NULL,
  created_at     TIMESTAMP   NOT NULL DEFAULT now(),
  CONSTRAINT pk_transactions PRIMARY KEY (transaction_id),
  CONSTRAINT fk_transactions_to_users FOREIGN KEY (user_id) REFERENCES user_admin.users (user_id)
);

CREATE TABLE user_admin.last_transactions (
  user_id        VARCHAR(30) NOT NULL,
  transaction_id BIGINT      NOT NULL,
  created_at     TIMESTAMP   NOT NULL DEFAULT now(),
  CONSTRAINT uk_last_transactions UNIQUE (user_id),
  CONSTRAINT fk_last_transactions_to_users FOREIGN KEY (user_id) REFERENCES user_admin.users (user_id),
  CONSTRAINT fk_last_transactions_to_transactions FOREIGN KEY (transaction_id) REFERENCES user_admin.transactions (transaction_id)
);

CREATE TABLE user_admin.profiles (
  transaction_id BIGINT       NOT NULL,
  user_name      VARCHAR(50)  NOT NULL,
  emai_address   VARCHAR(256) NOT NULL, -- refs. RFC 2821 SMTP
  created_at     TIMESTAMP    NOT NULL DEFAULT now(),
  CONSTRAINT uk_profiles UNIQUE (transaction_id),
  CONSTRAINT fk_profiles_to_transactions FOREIGN KEY (transaction_id) REFERENCES user_admin.transactions (transaction_id)
);

CREATE TABLE user_admin.deleted_users (
  user_id    VARCHAR(30) NOT NULL,
  created_at TIMESTAMP   NOT NULL DEFAULT now(),
  CONSTRAINT uk_deleted_users UNIQUE (user_id),
  CONSTRAINT fk_deleted_users_to_users FOREIGN KEY (user_id) REFERENCES user_admin.users (user_id)
);