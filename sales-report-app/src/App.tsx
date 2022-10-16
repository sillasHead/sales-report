import React, { useEffect, useState } from "react";
import "./App.scss";
import Chart from "react-apexcharts";

import { Navbar, Options } from "./components";
import { Typography } from "@mui/material";
import { api } from "./utils/api";
import { Sale } from "./types/sale";

type SeriesData = {
  name: string;
  data: number[];
};

type ChartData = {
  labels: {
    categories: string[];
  };
  series: SeriesData[];
};

function App() {
  const [sales, setSales] = useState<Sale[]>([]);
  const [productsStr, setProductsStr] = useState<string[]>([]);
  const [filteredSales, setFilteredSales] = useState<SeriesData[]>([]);

  useEffect(() => {
    const getData = async () => {
      const { data } = await api.get<Sale[]>("/sales");
      setSales(data);
    };

    getData();
  }, [productsStr]);

  useEffect(() => {
    const filter: SeriesData[] = [];

    productsStr.forEach((product) => {
      filter.push({ name: product, data: [0,0,0,0,0,0,0,0,0,0,0,0] });
    });

    sales.forEach((sale) => {
      const month = +sale.moment.toString().substring(5, 7) - 1;

      sale.productSales.forEach((item) => {
        const index = productsStr.indexOf(item.product.name);
        if (index !== -1) {
          filter[index].data[month] += item.quantity;
        }
      });
    });

    setFilteredSales(filter);
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [productsStr]);

  useEffect(() => {
    setChartData({
      labels: {
        categories: ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"],
      },
      series: filteredSales,
    });
  }, [filteredSales]);

  const [chartData, setChartData] = useState<ChartData>({
    labels: {
      categories: [],
    },
    series: [
      {
        name: "",
        data: [],
      },
    ],
  });

  return (
    <>
      <Navbar />
      <Options
        selectedProducts={productsStr}
        setSelectedProducts={setProductsStr}
      />
      <Typography variant="h4" style={{ textAlign: "center" }}>
        Sales By Month For:
      </Typography>
      <div className="chart">
        <Typography
          variant="h6"
          style={{
            textAlign: "center",
            transform: "rotate(180deg)",
            writingMode: "vertical-rl",
            display: "block",
          }}
        >
          Sales
        </Typography>
        <Chart
          options={{ xaxis: chartData.labels }}
          series={chartData.series}
          type="bar"
          height="240"
          width="1200px"
        />
      </div>
      <Typography variant="h6" style={{ textAlign: "center" }}>
        Months
      </Typography>
    </>
  );
}

export default App;
