import {
  Box,
  FormControl,
  InputLabel,
  OutlinedInput,
  Select,
  SelectChangeEvent,
} from "@mui/material";
import MenuItem from "@mui/material/MenuItem";
import Chip from "@mui/material/Chip";
import { useEffect, useState } from "react";
import { Brand } from "../../types/brand";
import { Category } from "../../types/category";
import { Product } from "../../types/product";
import { api } from "../../utils/api";
import "./styles.scss";

type SelectData<T> = {
  selected: T | undefined;
  data: T[];
};

type Props = {
  selectedProducts: string[];
  setSelectedProducts: (products: string[]) => void;
};

export function Options({ selectedProducts, setSelectedProducts }: Props) {
  const [brands, setBrands] = useState<SelectData<Brand>>({
    selected: undefined,
    data: [],
  });

  const [categories, setCategories] = useState<SelectData<Category>>({
    selected: undefined,
    data: [],
  });

  const [products, setProducts] = useState<Product[]>([]);

  useEffect(() => {
    const getData = async () => {
      const getBrands = await api.get<Brand[]>("/brands");
      const getCategories = await api.get<Category[]>("/categories");
      const getProducts = await api.get<Product[]>("/products", {
        params: {
          brand: getBrands.data[0].id,
          category: getCategories.data[0].id,
        },
      });

      setBrands({ selected: getBrands.data[0], data: getBrands.data });
      setCategories({
        selected: getCategories.data[0],
        data: getCategories.data,
      });
      setSelectedProducts([getProducts.data[0].name]);
      setProducts(getProducts.data);
    };

    getData();
  }, [setSelectedProducts]);

  useEffect(() => {
    const getData = async () => {
      const { data } = await api.get<Product[]>("/products", {
        params: {
          brand: brands.selected?.id,
          category: categories.selected?.id,
        },
      });

      setSelectedProducts([data[0].name]);
      setProducts(data);
    };

    getData();
  }, [brands, categories, setSelectedProducts]);

  const handleChange = (event: SelectChangeEvent<string[]>) => {
    if (event.target.value.length > 0)
      setSelectedProducts(event.target.value as string[]);
  };

  return (
    <div className="container">
      <FormControl style={{ minWidth: 200 }}>
        <InputLabel id="category">Category</InputLabel>
        <Select
          labelId="category"
          id="category"
          value={categories.selected?.name || ""}
          label="Category"
        >
          {categories.data.map((category) => (
            <MenuItem
              key={category.id}
              value={category.name}
              onClick={() =>
                setCategories((pv) => ({ ...pv, selected: category }))
              }
            >
              {category.name}
            </MenuItem>
          ))}
        </Select>
      </FormControl>

      <FormControl style={{ minWidth: 200 }}>
        <InputLabel id="product">Product</InputLabel>
        <Select
          labelId="product"
          id="product"
          multiple
          value={selectedProducts}
          input={<OutlinedInput id="select-multiple-product" label="Product" />}
          onChange={handleChange}
          renderValue={(selected) => (
            <Box sx={{ display: "flex", flexWrap: "wrap", gap: 0.5 }}>
              {selected.map((value) => (
                <Chip key={value} label={value} />
              ))}
            </Box>
          )}
        >
          {products.map((product) => (
            <MenuItem key={product.id} value={product.name}>
              {product.name}
            </MenuItem>
          ))}
        </Select>
      </FormControl>
      <FormControl style={{ minWidth: 200 }}>
        <InputLabel id="brand">Brand</InputLabel>
        <Select
          labelId="brand"
          id="brand"
          value={brands.selected?.name || ""}
          label="Brand"
        >
          {brands.data.map((brand) => (
            <MenuItem
              key={brand.id}
              value={brand.name}
              onClick={() => setBrands((pv) => ({ ...pv, selected: brand }))}
            >
              {brand.name}
            </MenuItem>
          ))}
        </Select>
      </FormControl>
    </div>
  );
}
