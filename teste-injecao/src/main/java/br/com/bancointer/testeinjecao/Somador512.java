package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador512")
public class Somador512 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
