insert into client (first_name, last_name, email) values
  ('Sushanth', 'Punuru', 'sushanth@example.com'),
  ('Asha', 'Rao', 'asha@example.com');

insert into account (client_id, account_number, type, balance) values
  (1, 'WL-1001', 'CHECKING', 2500.00),
  (1, 'WL-1002', 'BROKERAGE', 15000.00),
  (2, 'WL-2001', 'SAVINGS', 8000.00);