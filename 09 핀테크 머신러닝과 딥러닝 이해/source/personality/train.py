import pandas as pd
import numpy as np
from sklearn.ensemble import HistGradientBoostingClassifier
from sklearn.model_selection import cross_validate

game = pd.read_csv('./personality_datasert.csv')
game_data = game[['Time_spent_Alone','Stage_fear','Social_event_attendance','Going_outside','Drained_after_socializing','Friends_circle_size','Post_frequency']].to_numpy()
game_target = game['Personality'].to_numpy()
game = game.replace(to_replace={'Stage_fear':{'No':0,'Yes':1}})
game = game.replace(to_replace={'Drained_after_socializing':{'No':0,'Yes':1}})
game = game.replace(to_replace={'Personality':{'Introvert':0,'Extrovert':1}})
from sklearn.model_selection import train_test_split
train_input, test_input, train_target, test_target = train_test_split(
    game_data, game_target, test_size=0.2
)
hg = HistGradientBoostingClassifier()
scores = cross_validate(hg, train_input,train_target,return_train_score=True, n_jobs=-1)
print("train_score:", np.mean(scores['train_score']))
print("test_score:", np.mean(scores['test_score']))