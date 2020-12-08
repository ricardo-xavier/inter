package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador325")
public class Somador325 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
