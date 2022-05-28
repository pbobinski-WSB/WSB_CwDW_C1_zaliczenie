module.exports = {
    index(req, res) {
        res.send({text: "Index page"})
    },

    about(req, res) {
        res.send({text: "About us page"})
    },

    service(req, res) {
        res.send({text: "Service page"})
    }
}