import DataTable from 'components/DataTable';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';
import logo from './logo.svg';

function App() {
  return (
    <>
      <NavBar />
      <div className="container" >
        <h1 className="text-primary">Hello World</h1>
        <h1 className="text-success">Olá Mundo !</h1>
        <h1 className="text-success">שלום עולם</h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
