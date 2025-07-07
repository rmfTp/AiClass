import matplotlib.pyplot as plt
import matplotlib.animation as animation
import numpy as np
from matplotlib.colors import hsv_to_rgb

# 출력 파일 경로 (GIF 또는 MP4)
output_path = "smooth_hotpink_circle_12dots_120fps_slow.gif"

# 설정
num_dots = 12          # 점의 개수
fps = 120              # 초당 프레임 수
duration = 12          # 한 바퀴 도는데 걸리는 시간(초)
num_frames = fps * duration  # 총 프레임 수
radius = 1.0           # 원 반지름

# 핫핑크 색상 팔레트 (채도만 12단계 변화)
hue = 330 / 360.0  # 핫핑크 색상 (HSV)
saturations = np.linspace(0.2, 1.0, 12)
colors = [hsv_to_rgb((hue, s, 1.0)) for s in saturations]

# 점 좌표 계산 (시작 시 150도 회전 적용)
rotation_start = np.deg2rad(150)
angles = np.linspace(0, 2 * np.pi, num_dots, endpoint=False) + rotation_start
x_base = np.cos(angles) * radius
y_base = np.sin(angles) * radius

# 그림 초기화
fig, ax = plt.subplots(figsize=(4, 4))
scat = ax.scatter([], [], s=250, marker='o')
ax.set_xlim(-1.5, 1.5)
ax.set_ylim(-1.5, 1.5)
ax.set_aspect('equal')
ax.axis('off')

# 애니메이션 프레임 업데이트 함수
def update(frame):
    # 회전 각도 계산 (12초 동안 한 바퀴)
    rotation = 2 * np.pi * frame / num_frames
    x_rot = x_base * np.cos(rotation) - y_base * np.sin(rotation)
    y_rot = x_base * np.sin(rotation) + y_base * np.cos(rotation)

    # 색상 단계 계산
    color_indices = (frame + np.arange(num_dots)) % 12
    scat.set_offsets(np.column_stack([x_rot, y_rot]))
    scat.set_color([colors[i] for i in color_indices])
    return scat,

# 애니메이션 생성
ani = animation.FuncAnimation(
    fig, update, frames=num_frames, interval=1000 / fps, blit=True)

# GIF로 저장
ani.save(output_path, writer='pillow', fps=fps)
print(f"저장 완료: {output_path}")