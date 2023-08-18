import React, { useEffect, useState } from 'react';
import './App.css';
import axios from 'axios';

function App() {

  // const axiosBase = require('axios');
  const baseURL = axios.create({
    baseURL: 'http://localhost:3000',
  })

  const [todo, setTodo] = useState<String>();
  console.log(todo);

  const getTodo = () => {
    axios.get('http://localhost:3000/list').then((response) => {
      setTodo(response.data);
    }).catch((error) => {
      console.log(error);
    })
  };

  useEffect(() => {
    getTodo()
  },[])

  return (
    <div>
      <button>TEST</button>
      
    </div>
  );
}

export default App;
