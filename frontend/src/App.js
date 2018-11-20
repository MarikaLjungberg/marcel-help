import React, { Component } from 'react';
import './App.css';
import axios from 'axios';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import StartPage from './components/StartPage';
import ChooseUsername from './components/ChooseUsername';

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
        <StartPage />
        <ChooseUsername />
      </div>
    );
  }
}

export default App;
