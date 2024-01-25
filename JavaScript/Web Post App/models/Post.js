const db = require('./db')

const Post = db.postAppSequelize.define('posts', {
    title: {
        type: db.Sequelize.STRING
    },
    description: {
        type: db.Sequelize.TEXT
    }
})

module.exports = Post