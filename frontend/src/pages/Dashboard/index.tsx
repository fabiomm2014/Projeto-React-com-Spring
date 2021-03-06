import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";



const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container" >
                {/*         <h1 className="text-primary">Hello World</h1>
          <h1 className="text-success">Olá Mundo !</h1>
          <h1 className="text-success">שלום עולם</h1> */}
                <h1 className="text-primary py-3">Dashboard de vendas</h1>

                <div className="row px-3" >
                    <div className="col-md-6" >
                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-md-6" >
                        <h5 className="text-center text-secondary">Todas Vendas</h5>
                <DonutChart />
                    </div>
                </div>

                <div className="row px-3" >
                    <h2 className="text-primary"> Todas Vendas</h2>
                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;