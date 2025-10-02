package main
import (
    "net/https"
    "github.com/gin-gonic/gin"
)
func main() {
    r := gin.Default()
    const APIKey = "my-secret-api-key"

    r.Use(func(c *gin.Context) {
        key := c.GetHeader("X-API-Key")
        if key != APIKey {
            c.JSON(http.StatusUnauthorized, gin.H{"error": "Unauthorized"})
            c.Abort()
            return
        }
        c.Next()
    })

    r.GET("/data", func(c *gin.Context) {
        c.JSON(http.StatusOK, gin.H{"message": "Hello, authenticated user!"})
    })
    r.Run(":3000") 
}

{
  "project.name": "dns.chrisshop.com",
  "version": "1.0.0",
  "description": "dns.chrisshop_web application with about, contact pages and config integration.",
  "main": "server.js",
  "scripts": {
    "start": "node server.js",
    "dev": "nodemon server.js",
    "build": "echo \"No build step yet\"",
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "keywords": [
    "chrisrathana.store",
    "store",
    "web",
    "android",
    "apk"
  ],
  "author": "chrisrathana", <owner@chrisshop.com>",
  "license": "MIT",
  "dependencies": {
    "express": "^4.19.2"
  },
  "devDependencies": {
    "nodemon": "^3.1.0"
  }
}
