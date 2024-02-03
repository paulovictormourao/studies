const express = require('express')
const app = express()
const handlebars = require('express-handlebars')
const Post = require('./models/Post')

const door = 3000

    // Config
        // Handlebars
        function configureHandlebars() {
            app.engine('handlebars', handlebars.engine({
                defaultLayout: 'main',
                runtimeOptions: {
                    allowProtoPropertiesByDefault: true,
                    allowProtoMethodsByDefault: true,
                }
            }))
            app.set('view engine', 'handlebars')
        }

        // Middleware
        function configureMiddleware() {
            app.use(express.urlencoded({ extended: true }))
            app.use(express.json())
        }


function  principalPage(){
    app.get('/', function (req, res) {
        Post.findAll({order:[['id', 'DESC']]}).then(function (posts) {
            res.render('menu', {posts: posts})
        })
    })

}

function createPostPage(){
    app.get('/create-posts', function (req, res){
        res.render('create-post')
    })
}

function postsConfig(){
    app.post('/posted-successfully', function (req, res){
        Post.create({
            title : req.body.title,
            description : req.body.description
        }).then(function(){
            res.redirect('/')
        }).catch(function (error){
            res.send("An error has occurred:\n" + error)
        })
    })

    app.get('/delete/:id', function (req, res){
        Post.destroy({where: {'id': req.params.id}}).then(function () {
            res.redirect('/')
        }).catch(function (){res.send('post does not exist')})
    })
}



function renderAllPages(){
    principalPage()
    createPostPage()
    postsConfig()
}

function startServer() {
    app.listen(door, () => {
        console.log(`localhost:${door}`)
    })
}

function run() {
    configureHandlebars()
    configureMiddleware()
    renderAllPages()
    startServer()
}

run()
