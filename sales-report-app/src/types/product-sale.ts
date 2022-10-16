import { Product } from './product';
import { Sale } from './sale';

export type ProductSale = {
  sale: Sale;
  product: Product;
  quantity: number;
}
