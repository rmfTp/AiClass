import pickle
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split,GridSearchCV
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier

# 데이터 받아오기
df = pd.read_csv('diabetes_prediction_dataset.csv')

# 데이터 치환
df = df.replace(to_replace={'gender':{'Female':0,'Male':1, 'Other':2}})
df = df.replace(to_replace={'smoking_history':{'No Info':0, 'current':5, 'ever':4, 'former':3, 'never':1, 'not current':2}})

# 데이터와 정답 분리
diabetes_target = df['diabetes'].to_numpy()
diabetes_data = df.drop('diabetes', axis=1).to_numpy()

# 훈련/테스트 분리
train_input, test_input, train_target, test_target = train_test_split(
    diabetes_data, diabetes_target, test_size=0.1
)

# 데이터 정규화
ss = StandardScaler()
ss.fit(train_input)

train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

# SGDclssifier로 반복 학습
params = {'max_iter':np.arange(90,120)}
gs = GridSearchCV(SGDClassifier(loss='log_loss', n_jobs=-1,tol=None),params,n_jobs=-1)

# 학습해서 모델 도출
gs.fit(train_scaled,train_target)
model = gs.best_estimator_

# 모델 저장
with open('model.pkl','wb') as f:
    pickle.dump(model,f)

# Scaler 저장
with open('scaler.pkl','wb') as f:
    pickle.dump(ss,f)