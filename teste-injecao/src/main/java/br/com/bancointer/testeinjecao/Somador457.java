package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador457")
public class Somador457 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
