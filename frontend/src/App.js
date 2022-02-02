import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import {Router, Route, Link, Switch} from "react-router-dom";

import StartPage from './components/StartPage';
import ChooseUsername from './components/ChooseUsername';
import HelpList from './components/HelpList';

class App extends Component {

  componentWillMount() {
    axios.get('http://localhost:8080/help/')
    .then(function (response) {
      console.log(response);
    })
    .catch(function (error) {
      console.log(error);
    });
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <p>Get Help From Marcel!</p>
        </header>
        <Switch>
          <Route exact path='/' component={StartPage} />
          <Route exact path='/choose-username' component={ChooseUsername} />
          <Route path='/username/:username/list' component={HelpList} />
        </Switch>
      </div>
    );
  }
}

export default App;
