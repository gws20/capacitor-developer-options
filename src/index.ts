import { registerPlugin } from '@capacitor/core';
import type { DeveloperOptionsPlugin } from './definitions';

const DeveloperOptions = registerPlugin<DeveloperOptionsPlugin>('DeveloperOptions');

export * from './definitions';
export { DeveloperOptions };
