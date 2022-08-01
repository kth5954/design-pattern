//  Main Module
import mysql from "mysql";
const pool = mysql.createPool({
  connectionLimit: 10,
  host: "example.org",
  user: "kth5954",
  password: "secret",
  database: "MyDatabase",
});
pool.connect();

// Module A
pool.query(query, function (error, results, fields) {
  if (error) throw error;
  console.log("The  solution is: ", results[0].solution);
});

// Module B
pool.query(query, function (error, results, fields) {
  if (error) throw error;
  console.log("The  solution is: ", results[0].solution);
});
