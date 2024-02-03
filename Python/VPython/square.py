from vpython import *

# Configuração da cena
scene.width = 800
scene.height = 600
scene.title = "MHS"
scene.background = color.white

# Adicionando setas para representar os eixos
arrow(pos=vector(-3, 0, 0), axis=vector(6, 0, 0), color=color.black, shaftwidth=0.1)
arrow(pos=vector(0, -3, 0), axis=vector(0, 6, 0), color=color.black, shaftwidth=0.1)

# Parâmetros do movimento
radius = 3
angular_frequency = 0.05
amplitude = 1.5  # Mesma amplitude para ambas as direções

# Criando as bolas
rotating_ball = sphere(radius=0.2, color=color.blue)
oscillating_ball_y = sphere(radius=0.2, color=color.red)
oscillating_ball_x = sphere(radius=0.2, color=color.green)
oscillating_ball_a = sphere(radius=0.2, color=color.orange)
oscillating_ball_b = sphere(radius=0.2, color=color.purple)


# Criando curvas para representar as trajetórias
rotating_trajectory = curve(color=color.blue)



# Parâmetros da animação
t = 0
dt = 0.4

# Loop de animação
while True:
    rate(30)
    cos_ball = radius * cos(angular_frequency * t)
    sin_ball = radius * sin(angular_frequency * t)


    # Atualiza a posição da bola giratória na circunferência
    rotating_ball.pos = vector(cos_ball, sin_ball, 0)
    rotating_trajectory.append(pos=rotating_ball.pos)


    # Atualiza a posição da bola oscilante ao longo do eixo y (seno)
    oscillating_ball_y.pos = vector(0, sin_ball, 0)

    # Atualiza a posição da bola oscilante ao longo do eixo x (cosseno)
    oscillating_ball_x.pos = vector(cos_ball, 0, 0)

    a_function = (sin_ball + cos_ball) / 2
    oscillating_ball_a.pos = vector(a_function, a_function, 0)

    b_function = (sin_ball - cos_ball) / 2
    oscillating_ball_b.pos = vector(-b_function, b_function, 0)


    t += dt