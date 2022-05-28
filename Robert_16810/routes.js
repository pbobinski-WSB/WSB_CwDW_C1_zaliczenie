const route = require("express").Router()
const controller = require("./controller")

route.get("/", controller.index)

route.get("/about", controller.about)

route.get("/service", controller.service)

module.exports = route