import os
import sys
import json
import pickle as pkl
import numpy as np
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier

# 데이터 처리
# data = '[[0.0, 39.0, 1.0, 0.0, 0.0, 27.32, 5.7, 200.0], [0.0, 29.0, 0.0, 0.0, 1.0, 29.6, 5.7, 140.0], [0.0, 41.0, 0.0, 0.0, 0.0, 27.32, 6.0, 126.0], [0.0, 38.0, 0.0, 0.0, 0.0, 34.84, 4.5, 159.0], [0.0, 26.0, 0.0, 0.0, 5.0, 27.32, 6.6, 126.0]]'
if len(sys.argv)<2:
    sys.exit(-1)
data = np.array(json.loads(sys.argv[1]))

# 기준 경로
base_path = os.path.dirname(os.path.realpath(__file__))+'/'

# 파일 불러오기
with open(base_path+'model.pkl','rb') as f:
    model = pkl.load(f)
with open(base_path+'scaler.pkl','rb') as f:
    scaler = pkl.load(f)

# 모델로 예측
data_scaled = scaler.transform(data)
predictions = model.predict(data_scaled)
print(json.dumps(predictions.tolist()))