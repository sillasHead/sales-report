import { ProductSale } from './product-sale';

export type Sale = {
  id: number;
  moment: Date;
  productSales: ProductSale[];
}
