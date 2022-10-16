import { Brand } from './brand';
import { Category } from './category';

export type Product = {
  id: number;
  name: string;
  price: number;
  brand: Brand;
  category: Category;
}
