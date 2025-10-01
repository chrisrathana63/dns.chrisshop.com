import dotenv from "env";
dotenv.config();

console.log("Firebase Key:", process.env.FIREBASE_API_KEY);
console.log("Mongo URI:", process.env.MONGO_URI);
