const Sequelize = require('sequelize')
const postAppSequelize = new Sequelize('postapp', 'root', 'B@UHAUs2',{
    host:'localhost',
    dialect:'mysql',
})

module.exports = {
    Sequelize: Sequelize,
    postAppSequelize: postAppSequelize
}

