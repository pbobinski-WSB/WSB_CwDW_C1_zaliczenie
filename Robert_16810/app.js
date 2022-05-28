require("dotenv").config()
const express = require("express")
const app = express()

const port = process.env.PORT || 8000

const route = require("./routes")

app.use("/", route)

app.listen(port, () => {
    console.log(`Server started on port ${port}`)
})